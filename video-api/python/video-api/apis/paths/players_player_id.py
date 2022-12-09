from video-api.paths.players_player_id.get import ApiForget
from video-api.paths.players_player_id.delete import ApiFordelete
from video-api.paths.players_player_id.patch import ApiForpatch


class PlayersPlayerId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
