from django.shortcuts import render, redirect
from django.contrib.auth import login
from django.contrib.auth.views import LoginView
from .forms import UserRegistrationForm

# Custom Registration View
def register(request):
    if request.method == 'POST':
        form = UserRegistrationForm(request.POST)
        if form.is_valid():
            user = form.save()
            login(request, user)  # Log the user in after registration
            return redirect('home')  # Replace 'home' with your desired redirect URL
    else:
        form = UserRegistrationForm()
    return render(request, 'users/register.html', {'form': form})

# Custom Login View (using Django's built-in LoginView)
class CustomLoginView(LoginView):
    template_name = 'users/login.html'
    redirect_authenticated_user = True  # Redirect users who are already logged in