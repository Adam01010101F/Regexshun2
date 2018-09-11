var target = "a2_input.txt";
if(process.argv.length>2){
    target = process.argv[2];
}
var reader = require("fs");
reader.readFile(target,"utf-8", function(err, contents){
    var contArray = contents.split('\r\n');
    var regex = new RegExp('\\$(\\*)*(([1-9](\\d|\\d{2})?(\\,\\d{3})*)|0)\\.\\d{2}');
    for(var i = 0; i<contArray.length; i++){
        // var tString = "$**1,413.512";
        if(regex.test(contArray[i])==true){
            console.log("Match!");
        }else{
            console.log("Fail!");
        }
    }
});
