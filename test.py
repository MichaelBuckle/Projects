console.log('config.js');
console.log('version1');
list = []

def display():
    if len(list) == 0:
        print("please enter a number first")
    else:
        print(list)
    

def getnum(count, total,):
     if True: 
        try: 
            get1 = int(input(" enter a number " ))
            count += 1
            total += get1
            list.append(get1) 

 
        except ValueError:
            print(" not a number ")

         
def hi():
    if len(list) == 0:
        print("please enter a number first")
    else:
        print(max(list))     

def lo():
    if len(list) == 0:
        print("please enter a number first")
    else:
        print(min(list))  

def median():
    if len(list) == 0:
        print("please enter a number first")
    else:
        su = sum(list)/len(list)
        print(su)
  



def quit():
    print(" bye")
    quit

def su():
    if len(list) == 0:
            print("please enter a number first")
    else:
        print(sum(list))




def run():
    count = 0
    get1 = 0
    total = 0
    start = 0

    

    
    while start != "Q" :
       
        start= input("""
                     
            Select a option
        G Get a number
        S Display current sum
        A Display current average
        H display the current highest number
        L Display the current lowest number
        D Display all numbers entered
        Q Quit 
                """).upper()
    
            
        if start == "G":
            getnum(count, total)
            
        
        
        elif start == "S":
            su()

        
        elif start == "A":
            median()

        elif start =="H":
            hi()
        
        elif start == "L":
            lo()

        
            
        elif start == "D":
            display()

            
        
        elif start == "Q":
            quit
        
        else:
          print(" please enter a valid letter")  
    else:
        print ( "goodbye ")

               

run()