from django.conf import settings
from django.db import models
from buses.models import Bus, Schedule



# Create your models here.

class Seat(models.Model):
    bus = models.ForeignKey(Bus, on_delete=models.CASCADE)
    seat_number = models.CharField(max_length=5)
    is_booked = models.BooleanField(default=False)

class Booking(models.Model):
    user = models.ForeignKey(settings.AUTH_USER_MODEL, on_delete=models.CASCADE)
    scheduled = models.ForeignKey(Schedule, on_delete=models.CASCADE)
    seat = models.ForeignKey(Seat, on_delete=models.CASCADE)
    booking_date = models.DateTimeField(auto_now_add=True)
    payment_status = models.BooleanField(default=False)
