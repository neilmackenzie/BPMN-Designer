/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.obeonetwork.dsl.bpmn2.bpmdi.validation;

import org.eclipse.emf.common.util.EList;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNLabelStyle;
import org.obeonetwork.dsl.bpmn2.bpmdi.BPMNPlane;

/**
 * A sample validator interface for {@link org.obeonetwork.dsl.bpmn2.bpmdi.BPMNDiagram}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BPMNDiagramValidator {
	boolean validate();

	boolean validatePlane(BPMNPlane value);

	boolean validateLabelStyle(EList<BPMNLabelStyle> value);
}
