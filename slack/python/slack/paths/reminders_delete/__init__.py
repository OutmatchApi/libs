# do not import all endpoints into this module because that uses a lot of memory and stack frames
# if you need the ability to import all endpoints from this module, import them with
# from slack.paths.reminders_delete import Api

from slack.paths import PathValues

path = PathValues.REMINDERS_DELETE