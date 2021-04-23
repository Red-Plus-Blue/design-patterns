package com.red.plus.blue.design_patterns.command.concrete;

public class PasteCommand extends Command {

	public PasteCommand(Editor editor) {
		super(editor);
	}

	@Override
	public void run() {
		editor.setContent(editor.getClipboard());
	}

}
