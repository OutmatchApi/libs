# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from api.paths.api_app import Api

from api.paths import PathValues

path = PathValues.API_APP