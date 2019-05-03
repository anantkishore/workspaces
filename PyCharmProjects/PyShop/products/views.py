from django.http import HttpResponse
from django.shortcuts import render

# Create your views here.
# /products -> index


def index(request):
    return HttpResponse('Hi Anant here')


def new(request):
    return HttpResponse('New products')


