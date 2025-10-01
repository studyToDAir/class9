const oracle = require('oracledb')
oracle.initOracleClient({
    libDir: 'D:\\tools\\instantclient-basiclite-windows.x64-23.9.0.25.07\\instantclient_23_9'
})

// getEmp()

async function getEmp(){

    let conn

    try{
        // DB 접속
        conn = await oracle.getConnection({
            connectString: '125.181.132.133:51521/xe',
            user: 'scott4_0',
            password: 'tiger'
        })

        // SQL 준비
        const query = ' select * from emp'

        // SQL 실행 및 결과 확보
        const result = await conn.execute(query, [], {
            outFormat: oracle.OUT_FORMAT_OBJECT
        })

        // 결과 활용
        console.log('result', result)

    } catch( err ){
        console.log('>>> ERR >>>', err)
    } finally {
        if(conn){
            try{
                await conn.close()
            }catch(err){
                console.log('>>> finally > ERR >>>', err)
            }
        }
    }

}

// getDeptno(20)
async function getDeptno(deptno){

    let conn
    let result = {}

    try{
        // DB 접속
        conn = await oracle.getConnection({
            connectString: '125.181.132.133:51521/xe',
            user: 'scott4_0',
            password: 'tiger'
        })

        // SQL 준비
        const query = ' select * from emp where deptno = :deptno'

        // SQL 실행 및 결과 확보
        result = await conn.execute(query, [deptno], {
            outFormat: oracle.OUT_FORMAT_OBJECT
        })

        // 결과 활용
        // console.log('result', result)
        console.log('length', result.rows.length)
        console.log('첫번째', result.rows[0].ENAME)

    } catch( err ){
        console.log('>>> ERR >>>', err)
    } finally {
        if(conn){
            try{
                await conn.close()
            }catch(err){
                console.log('>>> finally > ERR >>>', err)
            }
        }
    }

    return result
}

module.exports = {
    // d : getDeptno,
    // getDeptno,
    getDeptno : getDeptno
}
