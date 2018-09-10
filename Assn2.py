
import re

if __name__=="__main__":
    
    regex = "\\$(\\*)*(([1-9](\\d?\\d?,?)*)|0).\\d\\d"
    testString = "$**2,054.23"
    if  re.match(regex, testString):
        print ("match!")
    else:
        print("fail!")
    