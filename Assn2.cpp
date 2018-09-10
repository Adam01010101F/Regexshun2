#include <iostream>
#include <string>
#include <istream>
#include <regex>

int main(){
    // std::ifstream input = new ifStream("a2_input.txt")
    std::regex r = ("\\$(\\*)*[1-9](\\d?\\d?,?)*.\\d\\d");
    std::string testString = "\\$(\\*)*(([1-9](\\d?\\d?,?)*)|0).\\d\\d";
    // if(std::regex_match())
}