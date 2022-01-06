class AccountP:
    def __init__(self,name,no,amount):
        self._name=name
        self._no=no
        self._balance=amount
    def deposit(self,amount):
        self._balance +=amount
    def widthdraw(self,amount):
        self._balance -=amount
    def dump(self):
        s = '%s,%s balance is : %s' %(self._name,self._no,self._balance)
        print(s)

koko=AccountP('Ko Ko','12345',23000)
koko.deposit(10000)
koko.widthdraw(15000)
#koko._balance=100000 # crime!
koko.dump()