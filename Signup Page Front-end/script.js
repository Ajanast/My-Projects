const form=document.querySelector('#form')
const username=document.querySelector('#username')
const email=document.querySelector('#email')
const password=document.querySelector('password')
const cpassword=document.querySelector('cpassword')

form.addEventListener('submit',(e)=>{
    e.preventDefault()
    inputvalidate()})
 

function inputvalidate(){
    const usernameVal=username.value.trim()
    const emailVal=email.value.trim()
    const password=password.value.trim()
    const cpassword=cpassword.value.trim()
    
    if(usernameVal==''){
        
        setError(username,'Username is required')
    }
    else{
        setSuccess(username)
    }
    if(emailVal==''){
        
        setError(email,'email is required')
    }
    else{
        setSuccess(email)
    }
    if(password==''){
        
        setError(password,'password is requird')
    }
    else{
        setSuccess(password)
    }
    if(cpassword==''){
       
        setError(cpassword,'confirm password is required')
    }
    else{
        setSuccess(cpassword)
    }
}
function setError(element,message){
    const errorobj=element.parentElement
    const errorval=errorobj.querySelector('.error')
    errorval.innerHtml=message
    errorobj.classList.add('error')
    errorobj.classList.add('success')

}
function setSuccess(element){
    const errorobj=element.parentElement
    const errorval=errorobj.querySelector('.error')
    errorval.innerHtml=''
    errorobj.classList.add('success')
    errorobj.classList.add('error')

}