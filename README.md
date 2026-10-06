# Minom

**A complete overhaul of Minecraft.**

Minom is a Fabric mod that rebuilds large parts of the game from the ground up in a real, hand-made sense — as an add-on that runs alongside the original codebase rather than replacing it. The goal is to make the world feel materially different: new terrain, new creatures, and a whole layer of new content that fits into the existing game.

Built for **Minecraft 1.19.2** on Java 17 using Fabric Loader and Fabric API.

## What it brings

Minom isn't a balance tweak or a small quality-of-life pack. It's intended to be a broad, ongoing expansion. Over time the mod will add:

- **New blocks** – fresh building and terrain materials, starting with the first registered block.
- **New items** – tools, consumables, and collectibles.
- **New entities** – mobs and living things with their own behaviour.
- **New world generation** – structures, ore deposits, biome features, and terrain shaping woven into generated chunks.

### Current: Wet Sand

The first feature shipped is **Wet Sand**, a new falling block (`minom:wet_sand`) registered alongside its block item. It copies the core behaviour of vanilla sand and is the foundation for later world-gen work, where wet sand is intended to appear naturally in the generated world.

This is just the start. Each new feature follows the same registration pattern in the mod's `block`, `item`, and `world` packages.

## Getting started

### Requirements

- [Fabric Loader](https://fabricmc.net/loom/) **>= 0.14.21**
- [Fabric API](https://modrinth.com/mod/fabric-api) for Minecraft 1.19.2
- Java **17** or newer
- Minecraft **1.19.2**

### Installing

1. Install Minecraft 1.19.2 with the Fabric Loader profile.
2. Put the latest build of Minom (`minom-*.jar`) and Fabric API into your `mods` folder.
3. Launch the game. The Wet Sand block is now available in the game.

For development setup in your IDE, see the [Fabric documentation](https://docs.fabricmc.net/develop/getting-started/creating-a-project#setting-up).

## Building from source

Minom is a Gradle project. Once you have a JDK 17 and a fresh clone:

```sh
# build the project (and the Fabric tooling)
./gradlew build
```

On Windows:

```sh
gradlew.bat build
```

The compiled, installable mod jar is produced under `build/libs`.

## Contributing

Minom is still very much a work in progress. If you want to help, it's a huge help to open an issue to report a bug, suggest a feature, or discuss a direction you'd like to see. All contributions are welcome.

## License

This project is released under **CC0-1.0** (public domain). Feel free to learn from, use, and incorporate it in your own project.


