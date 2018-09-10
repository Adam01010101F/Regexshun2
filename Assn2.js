var regex = new RegExp('\\$(\\*)*(([1-9](\\d?\\d?,?)*)|0).\\d\\d');
var tString = "$**1,413.512";
if(regex.test(tString)==true){
    console.log("Match!");
}else{
    console.log("Fail!");
}