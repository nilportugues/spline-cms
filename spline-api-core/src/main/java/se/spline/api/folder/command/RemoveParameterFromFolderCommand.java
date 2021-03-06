package se.spline.api.folder.command;

import se.spline.api.folder.FolderId;
import se.spline.api.folder.command.FolderCommand;
import se.spline.api.folder.parameter.FolderParameter;

import java.util.List;

public class RemoveParameterFromFolderCommand extends FolderCommand {
	public final static String COMMAND = "removeParametersFromFolderCommand";
	private final List<FolderParameter<?>> parameters;

	public RemoveParameterFromFolderCommand(FolderId folderId, List<FolderParameter<?>> parameters) {
		super(folderId);

		this.parameters = parameters;
	}

	public List<FolderParameter<?>> getParameters() {
		return parameters;
	}
}
