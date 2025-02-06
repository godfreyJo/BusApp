from django.db import models

# Create your models here.

class Bus(models.Model):
    bus_number = models.CharField(max_length=10)
    seats = models.IntegerField()
    total_seats = models.IntegerField()

    class Meta:
        verbose_name_plural = "Buses"
    
    def __str__(self):
        return self.bus_number
    
class Route(models.Model):
    origin = models.CharField(max_length=100)
    destinaiton = models.CharField(max_length=100)

    def __str__(self):
        
        return self.origin + "-" + self.destinaiton

class Schedule(models.Model):
    bus = models.ForeignKey(Bus, on_delete=models.CASCADE)
    route = models.ForeignKey(Route, on_delete=models.CASCADE)
    departure_time = models.DateTimeField()
    arrival_time = models.DateTimeField()
    price = models.DecimalField(max_digits=10, decimal_places=2)