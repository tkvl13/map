import re
from geopy.geocoders import Nominatim
geolocator = Nominatim(user_agent="AlzaSyqVgr_o4pPo44a")
location = geolocator.reverse("37.2518649, 127.02928809999999")

location.raw

print('display name:', location.raw['display_name'])