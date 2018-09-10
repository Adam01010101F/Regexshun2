# Known Bug: Currently Accepts ',' anywhere before '.'
# Known Bug: Doesn't accept cents only

import re

if __name__=="__main__":
    regex = "\\$(\\*)*[1-9](\\d?\\d?,?)*.\\d\\d"
    with open("a2_input.txt") as file:
        for line in file:
            if  re.match(regex, line):
                print ("Match!")
            else:
                print(line +"fail!")
    if (file.closed==False):
        file.close
