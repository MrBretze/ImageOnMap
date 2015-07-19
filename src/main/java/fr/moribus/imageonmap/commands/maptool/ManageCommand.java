/*
 * Copyright (C) 2013 Moribus
 * Copyright (C) 2015 ProkopyL <prokopylmc@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package fr.moribus.imageonmap.commands.maptool;


import fr.moribus.imageonmap.commands.*;
import fr.moribus.imageonmap.gui.core.*;
import fr.moribus.imageonmap.gui.list.*;
import fr.moribus.imageonmap.guiproko.core.Gui;
import fr.moribus.imageonmap.guiproko.list.MaterialGui;


@CommandInfo(name = "manage")
public class ManageCommand extends Command
{
	public ManageCommand(Commands commandGroup)
	{
		super(commandGroup);
	}

	@Override
	protected void run() throws CommandException
	{
		//GuiManager.openGui(playerSender(), new MapListGui());
            Gui.open(playerSender(), new MaterialGui());
	}
}
