//copied from DT-BOP
package com.djs.dttectonic.cell;

import com.ferreusveritas.dynamictrees.api.cell.Cell;
import com.ferreusveritas.dynamictrees.api.cell.CellKit;
import com.ferreusveritas.dynamictrees.api.cell.CellNull;
import com.ferreusveritas.dynamictrees.api.cell.CellSolver;
import com.ferreusveritas.dynamictrees.api.registry.Registry;
import com.ferreusveritas.dynamictrees.cell.CellKits;
import com.ferreusveritas.dynamictrees.cell.NormalCell;
import com.ferreusveritas.dynamictrees.util.SimpleVoxmap;
import net.minecraft.resources.ResourceLocation;
import com.djs.dttectonic.DynamicTreesTectonic;

public class DTTectonicCellKits {

    public static class SparseCellKit extends CellKit {
        protected final Cell sparseBranch = new SparseBranchCell();
        protected final Cell sparseLeaves = new NormalCell(1);

        protected final CellSolver solver = new CellKits.BasicSolver(new short[]{0x0211});

        public SparseCellKit(ResourceLocation registryName) {
            super(registryName);
        }

        @Override
        public Cell getCellForLeaves(int hydro) {
            return hydro > 0 ? sparseLeaves : CellNull.NULL_CELL;
        }

        @Override
        public Cell getCellForBranch(int radius, int meta) {
            return radius == 1 ? sparseBranch : CellNull.NULL_CELL;
        }

        @Override
        public SimpleVoxmap getLeafCluster() {
            return DTTectonicLeafClusters.SPARSE;
        }

        @Override
        public CellSolver getCellSolver() {
            return solver;
        }

        @Override
        public int getDefaultHydration() {
            return 1;
        }
    }

    public static final CellKit SPARSE = new SparseCellKit(new ResourceLocation(DynamicTreesTectonic.MOD_ID, "sparse"));

    public static void register(final Registry<CellKit> registry) {
        registry.registerAll(SPARSE);
    }

}
