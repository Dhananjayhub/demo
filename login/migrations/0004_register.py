# Generated by Django 4.1.5 on 2023-01-18 10:39

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('login', '0003_auto_20190928_0846'),
    ]

    operations = [
        migrations.CreateModel(
            name='Register',
            fields=[
                ('id', models.AutoField(primary_key=True, serialize=False)),
                ('name', models.CharField(blank=True, max_length=250)),
                ('email', models.CharField(max_length=250)),
                ('gender', models.CharField(max_length=250)),
                ('age', models.CharField(max_length=250)),
                ('state', models.CharField(max_length=250)),
                ('occupation', models.CharField(max_length=250)),
            ],
        ),
    ]