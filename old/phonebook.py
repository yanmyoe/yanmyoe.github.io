class PhoneBook:
    def __init__(self,name,mobile=None,email=None,office=None,private=None):
        self.name=name
        self.mobile=mobile
        self.email=email
        self.office=office
        self.private=private
    def add_email(self,email):
        self.email=email
    def get_email(self):
        return self.email
    def add_mobile(self,mobile):
        self.mobile=mobile
    def add_office(self,office):
        self.office=office
    def add_private(self,private):
        self.private=private
    def dump(self):
        s='Name: %s \nEmail: %s \nMobile: %s' %(self.name,self.email,self.mobile)
        print(s)
    def __str__(self):
        return self.name + ' ' + self.email
p1=PhoneBook('Mg Mg','0923344555','mgmg@gmail.com')
p1.dump()
p2=PhoneBook('Ag Ag')
p2.dump()
#p2.email="AgAG@gmail.com"
p2.add_email('agag@gmail.com')
p2.add_mobile('0944332222')
p2.dump()
p2_email=p2.get_email()
print(p2_email)

phone_book={'mgmg':p1,'agag':p2}
for p in phone_book:
    phone_book[p].dump()

print(p1)