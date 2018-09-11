# Known Bug: Currently Accepts ',' anywhere before '.'
# Known Bug: Doesn't accept cents only

import re, sys

if __name__=="__main__":
    target = "a2_input.txt"
    if(len(sys.argv)>1):
        target = sys.argv[1]
        print("CLI entry")
    regex = "\\$(\\*)*(([1-9](\\d|\\d{2})?(,\\d{3})*)|0)\\.\\d{2,2}"
    with open(target) as file:
        for line in file:
            if  re.match(regex, line):
                print (line + "Match!")
            else:
                print("Fail!")
    if (file.closed==False):
        file.close