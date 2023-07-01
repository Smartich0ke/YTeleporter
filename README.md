# YTeleporter
A Spigot plugin that teleports all players X blocks up every X seconds

## Installation

1. Download plugin jar from Releases tab.
2. Move the jar into `plugins/` directory of server.
4. Reboot the server and enjoy.

## Usage

### Commands

You need to be an op to run these comands.

`/start-teleporter` Starts the teleporter.

`/stop-teleporter` Stops the teleporter.

## config.yml:

Config file can be found at `plugins/YTeleporter/config.yml`. Restart server after changes are made.

`teleport-height: 500` The amount of blocks all players should be teleported up by

`teleport-interval: 300` The delay (in seconds) that the teleporter should run (defualt is 5 mins)
