from apivideo.paths.players_player_id.get import ApiForget
from apivideo.paths.players_player_id.delete import ApiFordelete
from apivideo.paths.players_player_id.patch import ApiForpatch


class PlayersPlayerId(
    ApiForget,
    ApiFordelete,
    ApiForpatch,
):
    pass
