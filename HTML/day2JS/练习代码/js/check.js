//在鼠标离开焦点时, 校验输入框内容的长度 .
//校验用户名
export let checkUsername = function () {
    let errMsg = '';
    let flag = true;
    let username = document.querySelector('#username').value;
    if (!/^\w{4,16}$/.test(username)) {
        errMsg = '用户名格式不正确';
        flag = false;
    }
    document.querySelector('#name_msg').innerHTML = errMsg;
    return flag;
}
document.querySelector('#username').addEventListener('blur', checkUsername)


//校验密码
export let checkPhone = function () {
    let errMsg = '';
    let flag = true;
    let phone = document.querySelector('#phone').value;
    if (!/^1[3-9]\d{9}$/.test(phone)) {
        errMsg = '手机号格式不正确';
        flag = false;
    }
    document.querySelector('#phone_msg').innerHTML = errMsg;
    return flag;
}
document.querySelector('#phone').addEventListener('blur', checkPhone)

//在表单提交时, 判断是否所有的输入框输入的值合法 .
document.querySelector('form').addEventListener('submit', (e) => {
    if (!checkUsername() || !checkPassword()) {
        alert('表单校验失败, 不能提交表单')
        e.preventDefault();
    }
})