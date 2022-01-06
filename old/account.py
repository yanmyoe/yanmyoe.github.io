from typing import _SpecialForm


class Account:
    def __init__(self,name,account_no,balance):
        self.name=name
        self.no=account_no
        self.balance=balance
    def deposite(self,amount):
        self.balance +=amount
    def widthdraw(self,amount):
        self.balance -=amount
    def dump(self):
        s='%s , %s balance is : %s' %(self.name,self.no,self.balance)
        print(s)

mgmg=Account('Mg Mg','12345',25000)
mgmg.dump()
mgmg.deposite(10000)
mgmg.dump()
mgmg.widthdraw(8000)
mgmg.dump()

koko=Account('Ko Ko','1112235',400000)
koko.widthdraw(120000)
koko.name='Ko Ko Maung'
koko.balance=500000
koko.dump()