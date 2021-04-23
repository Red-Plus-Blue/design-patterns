package com.red.plus.blue.design_patterns.command.concrete;

public class CopyCommand extends Command {

	public CopyCommand(Editor editor) {
		super(editor);
	}

	@Override
	public void run() {
		editor.setClipboard(editor.getContent());
	}

}
