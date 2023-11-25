//校验用户名
export let checkUsername = function() {
  let errMsg = '';
  let flag = true;
  let username = document.querySelector('#username').value;
  if(!/^\w{4,16}$/.test(username)){
      errMsg = '用户名格式不正确';
      flag = false;
  }
  document.querySelector('#name_msg').innerHTML = errMsg;
  return flag;
}

//校验密码
export let checkPhone = function() {
  let errMsg = '';
  let flag = true;
  let phone = document.querySelector('#phone').value;
  if(!/^1[3-9]\d{9}$/.test(phone)){
      errMsg = '手机号格式不正确';
      flag = false;
  }
  document.querySelector('#phone_msg').innerHTML = errMsg;
  return flag;
}