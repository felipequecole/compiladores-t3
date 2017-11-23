import matplotlib.pyplot as plt
field = plt.imread('campo.jpg')
plot = plt.imshow(field)
plt.scatter([50.0,100.0,150.0,200.0],[400.0,400.0,400.0,400.0], c='w', s = 200)
plt.scatter([50.0,116.66666666666667,183.33333333333334],[283.3333333333333,283.3333333333333,283.3333333333333], c='w', s = 200)
plt.scatter([50.0,116.66666666666667,183.33333333333334],[166.66666666666663,166.66666666666663,166.66666666666663], c='w', s = 200)
plt.axis('off')
plot.axes.get_xaxis().set_visible(False)
plot.axes.get_yaxis().set_visible(False)
plt.savefig('saida_sera.png', bbox_inches='tight', pad_inches=-0.11)
