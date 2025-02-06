from django.urls import path
from .views import seat_selection
from .views import register, CustomLoginView

urlpatterns = [
    path('seats/<int:schedule_id>/', seat_selection, name='seat_selection'),
]