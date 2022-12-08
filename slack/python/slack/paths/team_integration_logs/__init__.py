# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from slack.paths.team_integration_logs import Api

from slack.paths import PathValues

path = PathValues.TEAM_INTEGRATION_LOGS