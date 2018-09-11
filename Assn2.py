# Known Bug: Currently Accepts ',' anywhere before '.'
# Known Bug: Doesn't accept cents only

import re

if __name__=="__main__":
    regex = "\\$(\\*)*(([1-9](\\d{0,2},?)*)|0)\\.\\d{0,2}"
    with open("a2_input.txt") as file:
        for line in file:
            if  re.match(regex, line):
                print ("Match!")
            else:
                print("Fail!")
    if (file.closed==False):
        file.close