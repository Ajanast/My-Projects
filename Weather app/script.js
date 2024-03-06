document.addEventListener("DOMContentLoaded",function(){
    const apiurl="https://api.openweathermap.org/data/2.5/weather?q=";

//`https://api.openweathermap.org/data/2.5/weather?q={city name}&appid={API key}`
const apiid="1846c734b37afc0db9c8f998114f7ef0";
const searchinput=document.getElementById("searchinp")
const searchbtn=document.getElementById("searchbutton")
async function getweather(){
    await weather(searchinput.value)
}
async function weather(city){
    try{
        const response=await fetch(`${apiurl}${city}&units=metric&apiid=${apiid}`);
    const data=await response.json()
    if(data.code===401){
        console.error(data.message)
    }
    if(data.main && data.main.temp!==undefined){
        console.log(data)
    document.getElementById("city-info").innerHTML=data.name;
    document.getElementById("city-data").innerHTML=Math.round(data.main.temp)+"°C";

    }else{
        console.error("Weather data not available for the specified city")
    }
    
    }
    catch(error){
        console.error("error : ",error)
    }
}
searchbtn.addEventListener("click",getweather);

});