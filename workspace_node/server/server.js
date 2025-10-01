const express = require('express')
const app = express()
const appRoot = require('app-root-path').path
const session = require('express-session')
const bodyParser = require('body-parser')

// const db = require('./db/oracle.js')
// const db = require('./db/oracle')

// const db = require('./db/index.js')
// const db = require('./db/index')
// const db = require('./db')

const db = require('./oracle')

const port = 3000
app.listen(port, function(){
    console.log('서버 켜짐', port, appRoot)
})

app.set('views', appRoot+'/ui/views')
app.set('view engine', 'ejs')

// 파라메터로 받은 json을 해석할 수 있음
app.use(bodyParser.urlencoded({ extended: false }));
app.use(bodyParser.json());

app.use( express.static(appRoot+'/ui/public') )
app.use( session({
    secret: 'minsu@#',
    resave: false,              // 세션 내용이 바뀌지 않으면 저장 안함
    saveUninitialized: false,   // 로그인 안 한 사용자의 세션 저장 안함
    rolling: true,              // 활동이 있으면 갱신
    cookie: { maxAge: 30*60*1000 }  // 30분 후 로그인 풀림
}) )
app.use(aop)

app.get('/hello', function(req, resp){
    console.log('hello express')
})

app.get('/echo', function(req, resp){
    // get 방식일 때 파라메터
    const id = req.query.id
    console.log('id', id)
    resp.send(id)
})
app.get('/json', function(req, resp){
    const j = {
        a: 1,
        b: "eng",
        c: "한글"
    }
    resp.send(j)
})

app.get('/ejs', function(req, resp){
    resp.render('hello', {title: '타이틀'})
})

app.get('/login', function(req, resp){
    const pw = req.query.pw
    if( pw == '1234' ){
        req.session.user = {
            login: true
        }
        resp.send('로그인 성공')
    } else {
        resp.send('로그인 실패')
    }
})
app.get('/main', function(req, resp){
    if(req.session.user && req.session.user.login){
        resp.send('회원 전용 페이지를 보고계십니다')
    } else {
        resp.send('로그인이 필요합니다')
    }
})
app.get('/delay', async function(req, resp){
    await delay(2000)
    resp.send('2초가 지났습니다')
})

app.post('/ajax', function(req, resp){
    console.log(req.body.name, req.body.addr)

    resp.send(req.body)
})

app.get('/deptno', async function(req, resp){
    const deptno = req.query.deptno
    const result = await db.getDeptno(deptno)
    resp.send(result.rows)
})

function aop(req, resp, next){
    const before = new Date().getTime()

    next()

    resp.on('finish', function(){           // 응답이 끝났을 때
        const after = new Date().getTime()
        console.log(after - before);
    })
}

function delay(ms){
    return new Promise(function(resolve, reject){
        setTimeout(function(){
            resolve()
        }, ms)
    })
}
