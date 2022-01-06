class Student:
    name = "Mg Mg"
    age = 23
print(Student.name)

class Student2:
    def __init__(self,name,age):
        self.name = name
        self.age = age
    def show(self):
        s = self.name + ' is '+ self.age + ' years old!'
        print(s)
    
s1=Student2("Ma Ma","35")
print(s1.name,s1.age)
s1.show()
print(type(s1))

