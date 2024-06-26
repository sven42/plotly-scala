package plotly
package layout

import java.lang.{Boolean => JBoolean, Double => JDouble, Integer => JInt}

import dataclass.data
import plotly.element._

@data(optionSetters = true) class Axis(
    title: Option[String] = None,
    titlefont: Option[Font] = None,
    showgrid: Option[Boolean] = None,
    gridwidth: Option[Int] = None,
    gridcolor: Option[Color] = None,
    showline: Option[Boolean] = None,
    showticklabels: Option[Boolean] = None,
    linecolor: Option[Color] = None,
    linewidth: Option[Int] = None,
    autotick: Option[Boolean] = None,
    tickcolor: Option[Color] = None,
    tickwidth: Option[Int] = None,
    tickangle: Option[Double] = None,
    dtick: Option[Double] = None,
    ticklen: Option[Int] = None,
    tickfont: Option[Font] = None,
    tickprefix: Option[String] = None,
    ticksuffix: Option[String] = None,
    zeroline: Option[Boolean] = None,
    zerolinewidth: Option[Double] = None,
    zerolinecolor: Option[Color] = None,
    range: Option[Range] = None,
    autorange: Option[Boolean] = None,
    ticks: Option[Ticks] = None,
    domain: Option[Range] = None,
    side: Option[Side] = None,
    anchor: Option[AxisAnchor] = None,
    `type`: Option[AxisType] = None,
    overlaying: Option[AxisAnchor] = None,
    position: Option[Double] = None,
    tickmode: Option[TickMode] = None,
    tickvals: Option[Sequence] = None,
    ticktext: Option[Sequence] = None,
    nticks: Option[Int] = None,
    automargin: Option[Boolean] = None,
    @since("0.8.0")
    rangeslider: Option[RangeSlider] = None,
    @since("0.8.2")
    width: Option[Int] = None,
    height: Option[Int] = None,
    autosize: Option[Boolean] = None,
    @since("0.8.5")
    tickformat: Option[String] = None,
    fixedrange: Option[Boolean] = None
)

object Axis {
  @deprecated("Use Axis() and chain-call .with* methods on it instead", "0.8.0")
  def apply(
      title: String = null,
      titlefont: Font = null,
      showgrid: JBoolean = null,
      gridwidth: JInt = null,
      gridcolor: Color = null,
      showline: JBoolean = null,
      showticklabels: JBoolean = null,
      linecolor: Color = null,
      linewidth: JInt = null,
      autotick: JBoolean = null,
      tickcolor: Color = null,
      tickwidth: JInt = null,
      tickangle: JDouble = null,
      dtick: JDouble = null,
      ticklen: JInt = null,
      tickfont: Font = null,
      tickprefix: String = null,
      ticksuffix: String = null,
      zeroline: JBoolean = null,
      zerolinewidth: JDouble = null,
      zerolinecolor: Color = null,
      range: (Double, Double) = null,
      autorange: JBoolean = null,
      ticks: Ticks = null,
      domain: (Double, Double) = null,
      side: Side = null,
      anchor: AxisAnchor = null,
      `type`: AxisType = null,
      overlaying: AxisAnchor = null,
      position: JDouble = null,
      tickmode: TickMode = null,
      tickvals: Sequence = null,
      ticktext: Sequence = null,
      nticks: JInt = null,
      automargin: JBoolean = null
  ): Axis =
    Axis(
      Option(title),
      Option(titlefont),
      Option(showgrid).map(x => x: Boolean),
      Option(gridwidth).map(x => x: Int),
      Option(gridcolor),
      Option(showline).map(x => x: Boolean),
      Option(showticklabels).map(x => x: Boolean),
      Option(linecolor),
      Option(linewidth).map(x => x: Int),
      Option(autotick).map(x => x: Boolean),
      Option(tickcolor),
      Option(tickwidth).map(x => x: Int),
      Option(tickangle).map(x => x: Double),
      Option(dtick).map(x => x: Double),
      Option(ticklen).map(x => x: Int),
      Option(tickfont),
      Option(tickprefix),
      Option(ticksuffix),
      Option(zeroline).map(x => x: Boolean),
      Option(zerolinewidth).map(x => x: Double),
      Option(zerolinecolor),
      Option(range).map(x => x: Range),
      Option(autorange).map(x => x: Boolean),
      Option(ticks),
      Option(domain).map(x => x: Range),
      Option(side),
      Option(anchor),
      Option(`type`),
      Option(overlaying),
      Option(position).map(x => x: Double),
      Option(tickmode),
      Option(tickvals),
      Option(ticktext),
      Option(nticks).map(x => x: Int),
      Option(automargin).map(x => x: Boolean)
    )
}
