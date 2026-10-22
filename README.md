# Icterine Unofficial — Fabric 1.21.1

An unofficial Minecraft 1.21.1 Fabric port of [Icterine by Mephodio](https://github.com/Mephodio/Icterine). The original mod optimizes the server-side `minecraft:inventory_changed` advancement trigger. This port keeps the original seven configurable optimizations and updates the code and build for Minecraft 1.21.1.

This is a community port and is not affiliated with or endorsed by the original author. Please report 1.21.1 port issues to the maintainer of this port, not to the upstream project. The port source is at [JustHari01/Icterine-Fabric-1.21.1-Unofficial-Port](https://github.com/JustHari01/Icterine-Fabric-1.21.1-Unofficial-Port).

## What it changes

Icterine reduces unnecessary inventory advancement checks. Depending on config, it skips checks when a stack is emptied or reduced, avoids rescanning for increases that have not reached an advancement's item-count threshold, limits multi-item advancement scans to the changed item, checks item counts before more expensive item predicates, and avoids treating all player inventory slots as changed when a container opens.

The optimizations can alter behavior for custom advancement datapacks. Each optimization can be disabled independently in `config/icterine.yml`; if an advancement behaves differently, disable the related option and retest.

Icterine is server-side. Install it on the Fabric server; clients do not need it for the server-side optimization.

## Configuration

The port preserves the upstream defaults:

| Setting | Default | Purpose |
| --- | --- | --- |
| `debug_mode` | `false` | Write verbose diagnostic logs. |
| `ignore_triggers_for_emptied_stacks` | `true` | Skip checks when a changed stack becomes empty. |
| `ignore_triggers_for_decreased_stacks` | `true` | Skip checks when a stack's item count decreases. |
| `optimize_multiple_predicate_trigger` | `true` | Skip full inventory scans when the changed stack matches none of a trigger's item predicates. |
| `initialize_inventory_last_slots` | `true` | Avoid treating every player inventory slot as newly changed when a container opens. |
| `optimize_triggers_for_increased_stacks` | `true` | Check only when an increased count crosses a loaded advancement threshold. |
| `check_count_before_item_predicate_match` | `true` | Check count bounds before item, component, or sub-predicate matching. |

## Build and local test

Use Java 21 and run `gradlew.bat build`. To launch the development server, run `gradlew.bat runServer`. The first server launch creates `run/server/eula.txt`; set `eula=true` there only after personally accepting Mojang's EULA, then launch the task again.

## Attribution and license

The original Icterine code and this port are distributed under GPL-3.0-or-later. Original author: Mephodio. Original project pages: [GitHub source](https://github.com/Mephodio/Icterine), [Modrinth](https://modrinth.com/mod/icterine), and [CurseForge](https://www.curseforge.com/minecraft/mc-mods/icterine).
