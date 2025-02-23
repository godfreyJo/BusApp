# Generated by Django 5.1.6 on 2025-02-06 06:08

import django.db.models.deletion
from django.conf import settings
from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
        ('bookings', '0001_initial'),
        ('buses', '0001_initial'),
        migrations.swappable_dependency(settings.AUTH_USER_MODEL),
    ]

    operations = [
        migrations.AddField(
            model_name='booking',
            name='user',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to=settings.AUTH_USER_MODEL),
        ),
        migrations.AddField(
            model_name='seat',
            name='bus',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='buses.bus'),
        ),
        migrations.AddField(
            model_name='booking',
            name='seat',
            field=models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, to='bookings.seat'),
        ),
    ]
