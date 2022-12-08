# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from testing-api-video.paths.auth_refresh import Api

from testing-api-video.paths import PathValues

path = PathValues.AUTH_REFRESH