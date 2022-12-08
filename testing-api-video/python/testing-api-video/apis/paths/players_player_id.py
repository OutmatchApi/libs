from testing-api-video.paths.players_player_id.get import ApiForget
from testing-api-video.paths.players_player_id.delete import ApiFordelete
from testing-api-video.paths.players_player_id.patch import ApiForpatch


class PlayersPlayerId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
