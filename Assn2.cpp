#include <iostream>
#include <string>
#include <istream>
#include <regex>

int main(){
    // std::ifstream input = new ifStream("a2_input.txt")
    std::regex r ("\\$(\\*)*(([1-9](\\d?\\d?,?)*)|0).\\d\\d");
    std::string test = "$**2,018.75";
    if(std::regex_match(test, r)){
        std::cout<<"Match!";
    }
}