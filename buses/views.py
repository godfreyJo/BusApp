from django.shortcuts import render
from .models import Schedule

# Create your views here.
def home(request):
    return render(request, 'home.html')


def search_results(request):
    origin = request.GET.get('origin')
    destination = request.GET.get('destination')
    date = request.GET.get('date')
    
    schedules = Schedule.objects.filter(
        route__origin__icontains=origin,
        route__destination__icontains=destination,
        departure_time__date=date
    )
    return render(request, 'buses/search_results.html', {'schedules': schedules})