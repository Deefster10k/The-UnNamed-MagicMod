package com.deefster10k.tunmm.worldgen;

import com.deefster10k.tunmm.init.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class WorldGen implements IWorldGenerator
{

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider)
    {
        switch(world.provider.dimensionId){
            //case -1: generateNether(world, random, chunkX*16, chunkZ*16);
            case 0 : generateSurface(world, random, chunkX*16, chunkZ*16);
        }
    }
    private void generateSurface(World world, Random random, int x, int z)
    {
        //this.addOreSpawn(ModBlocks.oreWhatever, world, random, x=blockXPos, z=blockZPos, maxX, maxZ, maxVeinSize, chanceToSpawn, minY, maxY);
        this.addOreSpawn(ModBlocks.oreResonium, world, random, x, z, 16, 16, 4+random.nextInt(5), 10, 24, 86);

    }
    private void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int maxVeinSize, int chanceToSpawn, int minY, int maxY)
    {
        for(int i = 0; i < chanceToSpawn; i++)
        {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(maxY-minY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
