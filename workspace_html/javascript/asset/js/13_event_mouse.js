let view
let isDown = false;
let mouseX = 0;
let mouseY = 0;

window.onload = function(){
    view = document.querySelector("#view");

    const cursor = document.querySelector("#cursor");
    cursor.style.top = '-1000px';
    cursor.style.left = '-1000px';

    const drag = document.querySelector("#drag");
    drag.style.top = '0px';
    drag.style.left = '0px';

    bind()
}
function bind(){
    view.innerHTML = '안녕?<br>'

    document.querySelector('#mouse')
        .addEventListener('mousedown', function(evt){
            view.innerHTML = 'mousedown 발생<br>' + view.innerHTML

            console.log(evt)
            /*
                offset : DOM의 좌상단 기준
                page : 스크롤에 관계 없이 문서 좌상단 기준
                client : 지금 보이는 화면 좌상단 기준
            */
            view.innerHTML = `
                event.offsetX : ${evt.offsetX} event.offsetY : ${evt.offsetY}<br> 
                event.pageX : ${evt.pageX} event.pageY : ${evt.pageY}<br> 
                event.clientX : ${evt.clientX} event.clientY : ${evt.clientY}<br> 
                <br>
                ${view.innerHTML}
            `

            // offset 개념을 아니까 
            // 그 DOM으로 스크롤 바로 가기
            // window.scrollTo( view.offsetTop, null )
    })
    document.querySelector('#mouse')
        .addEventListener('mouseup', function(){
            view.innerHTML = 'mouseup 발생<br>' + view.innerHTML
    })
    document.querySelector('#mouse')
        .addEventListener('mousemove', function(){
            // 확인 했는데 너부 복잡시러워서 주석
            // view.innerHTML = 'mousemove 발생<br>' + view.innerHTML
    })
    // 마우스 들어옴 mouseover 또는 mouseenter
    document.querySelector('#mouse')
        .addEventListener('mouseover', function(){
            view.innerHTML = 'mouseover 발생<br>' + view.innerHTML

            document.querySelector('#mouse').style.backgroundColor = 'yellow'
    })
    // 마우스 나감 mouseout 또는 mouseleave
    document.querySelector('#mouse')
        .addEventListener('mouseout', function(){
            view.innerHTML = 'mouseout 발생<br>' + view.innerHTML

            document.querySelector('#mouse').style.backgroundColor = 'white'
    })


    document.querySelector('body')
        .addEventListener('mousemove', function(evt){

            const cursor = document.getElementById('cursor');

            cursor.style.top = evt.pageY+1 + 'px';
            cursor.style.left = evt.pageX+1 + 'px';
    })
    document.querySelector('#drag')
        .addEventListener('mousedown', function(evt){
        isDown = true;
        mouseX = evt.pageX
        mouseY = evt.pageY
    })
    document.querySelector('#drag')
        .addEventListener('mouseup', function(evt){
        isDown = false;           
    })
    document.querySelector('#drag')
        .addEventListener('mousemove', function(evt){
        if(isDown){
            // mouseX = evt.pageX - mouseX
            // mouseY = evt.pageY
            console.log('evt.pageY', evt.offsetY)
            const drag = document.getElementById('drag');
    
            drag.style.top = (parseInt(drag.style.top) + (evt.pageY - mouseY))  + 'px';
            drag.style.left = (parseInt(drag.style.left) + (evt.pageX - mouseX))  + 'px';

            mouseX = evt.pageX
            mouseY = evt.pageY
        }
    })

    
}