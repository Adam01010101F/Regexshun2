#include <iostream>
#include <string>
#include <fstream>
#include <regex>

int main(int argc, char* argv[]){
    std::ifstream input;
    if(argc>1){
        input.open(argv[1]) ;
    }else{
        input.open("a2_input.txt");
    }
    std::regex r ("\\$(\\*)*(([1-9](\\d|\\d{2})?(,\\d{3})*)|0)\\.\\d{2}");
    std::string test = "$**2,345.67";
    try{    
        while(input>>test){    //input.is_open() && !input.eof()
            std::cout<<test<<": ";
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