import {checkPhone, checkUsername} from './checkFn.js'

//在鼠标离开焦点时, 校验输入框内容的长度 .
document.querySelector('#username').addEventListener('blur', checkUsername)

//校验密码
document.querySelector('#phone').addEventListener('blur', checkPhone)

//在表单提交时, 判断是否所有的输入框输入的值合法 .
document.querySelector('form').addEventListener('submit', (e)=> {
    if(!checkUsername() || !checkPhone()){
        alert('表单校验失败, 不能提交表单')
        e.preventDefault();
    }
})