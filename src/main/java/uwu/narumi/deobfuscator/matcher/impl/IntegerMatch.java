package uwu.narumi.deobfuscator.matcher.impl;

import org.objectweb.asm.tree.AbstractInsnNode;

import uwu.narumi.deobfuscator.helper.ASMHelper;
import uwu.narumi.deobfuscator.matcher.IMatch;

public class IntegerMatch implements IMatch {
	
	public boolean match(AbstractInsnNode insn) {
		return insn != null && ASMHelper.isInteger(insn);
	}
}
