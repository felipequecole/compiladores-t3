import matplotlib.pyplot as plt
field = plt.imread('campo.jpg')
plot = plt.imshow(field)
plt.scatter([45,112.5,187.5,255], [400,400,400,400], c='w', s=200) # defesa
plt.scatter([100,200,150], [300,300,200], c='w', s=200) # meio
plt.scatter([75,150,225], [100,50,100], c='w', s=200)
plt.axis('off')
plot.axes.get_xaxis().set_visible(False)
plot.axes.get_yaxis().set_visible(False)
# extent = ax.get_window_extent().transformed(plt.gcf().dpi_scale_trans.inverted())
plt.savefig('saida.png', bbox_inches='tight', pad_inches=-0.11)
