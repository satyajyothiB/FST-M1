class car:
    'This class is to describe car details'
    def __init__(self,manufacturer, model, make, transmission, color):
        self.manufacturer=manufacturer
        self.model=model
        self.make=make
        self.transmission=transmission
        self.color=color
    def accelerate(self):
        print(self.manufacturer,self.model," is moving")
    def stop(self):
        print(self.manufacturer,self.model," has stopped")
c1=car("Maruthi","Celerio","2017","Automatic","white")
c2=car("maruthi","Swift","2015","Manual","Gray")
c3=car("Volkswagen","polo","2016","Automatic","red")
c1.accelerate()
c1.stop()
c2.accelerate()
c2.stop()
c3.accelerate()
c3.stop()



