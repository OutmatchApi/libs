# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from slack.paths.admin_teams_list import Api

from slack.paths import PathValues

path = PathValues.ADMIN_TEAMS_LIST