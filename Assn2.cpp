#include <iostream>
#include <string>
#include <fstream>
#include <regex>

int main(){
    std::ifstream input("a2_input.txt");
    std::regex r ("\\$(\\*)*(([1-9](\\d?\\d?,?)*)|0).\\d\\d");
    std::string test = "$**2,345.67";
    try{    
        while(input>>test){    //input.is_open() && !input.eof()
            std::cout<<test<<std::endl;
            if(std::regex_match(test, r)){
                std::cout<<"Match!\n";
            }else{
                std::cout<<"Fail!\n";
            }
        }
    }catch(int e){
        std::cout<<"You caught a bug, "<<e<<std::endl;
    }
    input.close();
    return 0;
}