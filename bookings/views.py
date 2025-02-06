from django.shortcuts import render
from django.shortcuts import get_object_or_404
from .models import Schedule, Seat

# Create your views here.

def seat_selection(request, schedule_id):
    schedule = get_object_or_404(Schedule, id=schedule_id)
    seats = Seat.objects.filter(bus=schedule.bus)
    return render(request, 'seat_selection.html', {
        'seats': seats,
        'seat_price': schedule.price
    })
